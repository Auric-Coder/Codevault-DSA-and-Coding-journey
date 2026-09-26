class Trie {
public:
    struct Node {
        Node* child[26];
        bool end;

        Node() {
            end = false;
            for(int i = 0; i < 26; i++)
                child[i] = NULL;
        }
    };
    Node* root;
    Trie() {
        root = new Node();
    }
    
    void insert(string word) {
        Node* curr = root;
        for(char c : word) {
            int i = c - 'a';
            if(curr->child[i] == NULL) curr->child[i] = new Node();
            curr = curr->child[i];
        }
        curr->end = true;
    }
    
    bool search(string word) {
        Node* curr = root;
        for(char c : word) {
            int i = c - 'a';
            if(curr->child[i] == NULL) return false;
            curr = curr->child[i];
        }
        return curr->end;
    }
    
    bool startsWith(string prefix) {
        Node* curr = root;
        for(char c : prefix) {
            int i = c - 'a';
            if(curr->child[i] == NULL) return false;
            curr = curr->child[i];
        }
        return true;
    }
};

/**
 * Your Trie object will be instantiated and called as such:
 * Trie* obj = new Trie();
 * obj->insert(word);
 * bool param_2 = obj->search(word);
 * bool param_3 = obj->startsWith(prefix);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna