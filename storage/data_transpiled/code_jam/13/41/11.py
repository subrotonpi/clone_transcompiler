def _import ( ) :
    from math import pow
    from os import getenv
    from os import getenv
    from os import getenv
    from os import getenv
    from os import getenv
    from os import getenv
    from os import getenv
    from os import getenv
    from os import getenv
    class Main ( object ) :
        class Pair :
            def __init__ ( self , x1 , y1 , go1 ) :
                self.x , self.y = x1 , y1
                if self.go :
                    self.st.append ( self.top )
        def __call__ ( self , x1 , y1 , go1 ) :
            self.x , self.y = x1 , y1
            self.go = go1
    class CustomComparator ( Comparator ) :
        def compare ( self , p1 , p2 ) :
            if p1.x != p2.x :
                return cmp ( p1.x , p2.x )
            if p1.go != p2.go :
                return cmp ( p1.go , p2.go )
            return 0
        def calc ( self , len , n ) :
            return ( pow ( n , 2 ) * pow ( len , n ) ) - ( pow ( len , n ) * pow ( len + 1 ) / 2 )
    def main ( ) :
        with open ( getenv ( "input.txt" ) , "w" ) as f :
            T = getenv ( "input.txt" )
            for ti in range ( 1 , T + 1 ) :
                f.write ( "Case #%d: " % ti )
                n = getenv ( "input.txt" )
                m = getenv ( "input.txt" )
                ls = [ ]
                sum1 = 0
                sum2 = 0
                for i in range ( m ) :
                    x , y , z = map ( int , st.pop ( ) )
                    ls.append ( ( x , z , False ) )
                    ls.append ( ( y , z , True ) )
                    sum1 = sum1 + calc ( y - x , n ) * pow ( z , n )
                ls.sort ( key = CustomComparator ( ) )
                st = [ ]
                for i in range ( len ( ls ) ) :
                    st.append ( st [ i ] )
            return st
    return main
    