def main ( ) :
    import sys
    from string import atoi
    from math import log
    from string import digits
    from math import log
    from string import letters
    n = int ( n )
    str = digits.strip ( )
    s = str.split ( '' )
    ans = [ ]
    count1 = count2 = count3 = count4 = 0
    for i in range ( n ) :
        ans.append ( int ( s [ i ] ) )
        if ans [ i ] == 1 :
            count1 += 1
        elif ans [ i ] == 2 :
            count2 += 1
        elif ans [ i ] == 3 :
            count3 += 1
        elif ans [ i ] == 4 :
            count4 += 1
    max = count1
    min = count1
    for i in range ( 4 ) :
        if max < count2 :
            max = count2
        if max < count3 :
            max = count3
        if max < count4 :
            max = count4
    print ( max , min )
