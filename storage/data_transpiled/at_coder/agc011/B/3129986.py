def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( sys.stdin.readline ( ).strip ( ) )
    A = [ ]
    for i in range ( n ) :
        A.append ( sc.read ( ) )
    A.sort ( )
    sum = [ A [ 0 ] ]
    for i in range ( 1 , n ) :
        sum [ i ] = sum [ i - 1 ] + A [ i ]
    ans = 1
    for i in range ( n - 1 , 1 , - 1 ) :
        if A [ i ] <= 2 * sum [ i - 1 ] :
            ans += 1
        else :
            break
    print ( ans )
