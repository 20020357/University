if __name__ == '__main__':
    studentDictionary = {}
    for _ in range(int(input())):
        name = input()
        score = float(input())
        studentDictionary.update({name: score})
    
    studentDictionary = {k: v for k, v in sorted(studentDictionary.items(), key = lambda item: item[0])}
    secondLowestScore = sorted(set(studentDictionary.values()))[1]
    for i in studentDictionary: 
        if (studentDictionary[i] == secondLowestScore):
            print(i, end = '\n')