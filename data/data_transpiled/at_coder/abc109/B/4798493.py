def main ( arg ) :
    import sys
    class Main ( object ) :
        MOD = 1000000007l
        def __init__ ( self , mod ) :
            self.mod = mod
        def __call__ ( self , * args ) :
            sc = sys.stdin
            n = len ( sc.readline ( ) )
            a = [ sc.readline ( ) for i in range ( n ) ]
            sc.close ( )
            first = a [ 0 ] [ - 1 ]
            ans = True
            for i in range ( 1 , n ) :
                if not ( first == a [ i ] [ 0 ] ) :
                    ans = False
                    break
                else :
                    first = a [ i ] [ - 1 ]
            if ans :
                a.sort ( )
                prev = a [ 0 ]
                for i in range ( 1 , n ) :
                    if prev == a [ i ] :
                        ans = False
                        break
                    else :
                        prev = a [ i ]
            print ( 'Yes' if ans else 'No' )
    return Main
