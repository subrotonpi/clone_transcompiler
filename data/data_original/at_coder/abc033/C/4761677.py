S=input()
print(sum([not '0' in s for s in S.split('+')]))