def main ( ) :
    import sys
    from time import sleep
    from os.path import join
    from os import sep
    from os import chdir
    from os import urandom
    n = int ( sys.argv [ 1 ] )
    chdir ( '/' )
    sum = 0
    tmp = 2
    s = [ ]
    al = [ ]
    if n == 3 :
        print ( '2 5 63' )
        return
    if n == 4 :
        print ( '2 5 20 63' )
        return
    if n == 5 :
        print ( '2 5 30 50 63' )
        return
    for i in range ( n ) :
        while 1 :
            if tmp % 2 == 0 or tmp % 3 == 0 :
                al.append ( tmp )
                sum += tmp
                tmp += 1
                break
            tmp += 1
        if sum % 6 == 0 :
            pass
        elif sum % 6 == 2 :
            al -= [ ( 8 , 9 ) ]
            al += 30000
        elif sum % 6 == 3 :
            al -= [ ( 9 , 9 ) ]
            al += 29998
        for i in al :
            s.append ( i )
        print ( join ( s ) )
