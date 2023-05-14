if __name__ == '__main__':
    N = int(input())

    list_result = []
    for _ in range(N):
        input_data = input().split()
        if (input_data[0] == 'append'):
            list_result.append(int(input_data[1]))
        if (input_data[0] == 'insert'):
            list_result.insert(int(input_data[1]), int(input_data[2]))
        if (input_data[0] == 'print'):
            print(list_result)
        if (input_data[0] == 'pop'):
            list_result.pop()
        if (input_data[0] == 'reverse'):
            list_result.reverse()
        if (input_data[0] == 'remove'):
            list_result .remove(int(input_data[1]))
        if (input_data[0] == 'sort'):
            list_result.sort()