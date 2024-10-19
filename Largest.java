static int largestElement(int[] arr, int n) {
        int largest = arr[0];  // Initialize 'largest' with the first element
        
        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];  // Update 'largest' if a larger element is found
            }
        }
        
        // Return the largest element after checking all elements
        return largest;  
    }
