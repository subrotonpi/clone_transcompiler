A = input()
str1 = A.replace('O','0')
str2 = str1.replace('D','0')  
str3 = str2.replace('I','1')
str4 = str3.replace('Z','2')
str5 = str4.replace('S','5')
str6 = str5.replace('B','8')
print(int(str6))