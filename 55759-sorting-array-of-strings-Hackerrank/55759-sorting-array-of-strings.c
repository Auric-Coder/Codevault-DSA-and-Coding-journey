
int lexicographic_sort(const char* a, const char* b) {
    return strcmp(a, b);
}

int lexicographic_sort_reverse(const char* a, const char* b) {
    return strcmp(b, a);
}

int sort_by_number_of_distinct_characters(const char* a, const char* b) {
    int countA[26] = {0};
    int countB[26] = {0};

    int distinctA = 0;
    int distinctB = 0;
    for (int i = 0; a[i] != '\0'; i++) {
        int index = a[i] - 'a';
        if (countA[index] == 0) {
            countA[index] = 1;
            distinctA++;
        }
    }
    for (int i = 0; b[i] != '\0'; i++) {
        int index = b[i] - 'a';
        if (countB[index] == 0) {
            countB[index] = 1;
            distinctB++;
        }
    }
    if (distinctA != distinctB) {
        return distinctA - distinctB;
    }
    return strcmp(a, b);
}

int sort_by_length(const char* a, const char* b) {
    int lenA = strlen(a);
    int lenB = strlen(b);
    if (lenA != lenB) {
        return lenA - lenB;
    }
    return strcmp(a, b);
}

void string_sort(char** arr, const int len,
                 int (*cmp_func)(const char* a, const char* b)) {

    for (int i = 0; i < len - 1; i++) {

        for (int j = 0; j < len - i - 1; j++) {

            if (cmp_func(arr[j], arr[j + 1]) > 0) {

                char* temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna