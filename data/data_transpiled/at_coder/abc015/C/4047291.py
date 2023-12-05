def _import ( ) :
    from math import sin , cos , tan
    class Main ( object ) :
        def solve ( self , n , k , ts ) :
            selects = [ 0 ] * n
            selects.append ( 0 )
            while True :
                xor = 0
                for i in range ( n ) :
                    xor = xor ^ ts [ i ] [ selects [ i ] ]
                if xor == 0 :
                    return True
                selects [ 0 ] += 1
                for i in range ( n - 1 ) :
                    if selects [ i ] >= k :
                        selects [ i ] = 0
                        selects [ i + 1 ] += 1
                    else :
                        break
                if selects [ n - 1 ] >= k :
                    break
            return False
        def main ( self ) :
            f = sys.stdin
            n , k , ts = f.read ( ).split ( )
            f.close ( )
            main = eval ( f )
            ret = main ( self , n , k , ts )
            if ret :
                print ( "Found" )
            else :
                print ( "Nothing" )
    return Main
