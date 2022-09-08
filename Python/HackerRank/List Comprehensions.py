if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())
    
    firstList = [i for i in range(x + 1)]
    secondList = [j for j in range(y + 1)]
    thirdList = [k for k in range(z + 1)]

    resultList = [[i, j, k] for i in firstList
                                for j in secondList
                                    for k in thirdList
                                        if (i + j + k) != n]
    print(resultList)