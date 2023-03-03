def main ( ) :
    import sys
    class Main ( object ) :
        def run ( self ) :
            with open ( "/proc/self/" , "r" ) as sc :
                n , x = sc.read ( ) * 2 - 1 , sc.read ( )
                if x == 1 or x == n :
                    print ( "No" )
                    return
                print ( "Yes" )
                ans = [ ]
                ans.append ( x )
                ans.append ( x + 1 )
                ans.append ( x - 1 )
                idx = 1
                for i in range ( n ) :
                    if idx == x - 1 :
                        idx += 3
                    if i == n / 2 - 1 :
                        i += 2
                        continue
                    ans.append ( idx )
                    idx += 1
                for i in range ( n ) :
                    print ( ans [ i ] )
