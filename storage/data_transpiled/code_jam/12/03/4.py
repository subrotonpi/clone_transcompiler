def main ( ) :
    import sys
    f = open ( 'test.txt' , 'r' )
    t = int ( f.readline ( ) )
    for c in range ( 1 , t + 1 ) :
        line = f.readline ( ).split ( )
        a = int ( line [ 0 ] )
        b = int ( line [ 1 ] )
        line = line [ 0 ].split ( )
        tenlen = 1
        for i in range ( 1 , len ( line ) ) :
            tenlen *= 10
        result = 0
        for n in range ( a , b ) :
            m = n
            while True :
                m = m // 10 + m % 10 * tenlen
                if m > n and m <= b :
                    result += 1
        print ( 'Case #%d: %d' % ( c , result ) )
