def main ( ) :
    import sys
    global cnt
    with open ( 'test.txt' , 'r' ) as sc :
        k = sc.read ( )
        a = 2
        b = 0
        for i in range ( 0 , k ) :
            tmpb = a
            a , b = tmpb + b , tmpb
        print ( '%d %d\n' % ( a , b ) )
        gcd ( a , b )
        if k != cnt :
            print ( 'check %d %d %d\n' % ( a , b , cnt ) )
