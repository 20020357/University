if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    
    inputList = []
    for i in arr:
        inputList.append(i)
    
    inputList.sort()
    inputList.reverse()
    for i in inputList:
        if (i == max(inputList)):
            continue
        else:
            print(i)
            break