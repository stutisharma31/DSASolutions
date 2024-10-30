def find_max(arr):
    max_num = arr[0]
    for num in arr:
        if num > max_num:
            max_num = num
    return max_num

# Example usage
arr = [3, 5, 1, 9, 2]
print(find_max(arr))  # Output: 9
