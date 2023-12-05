def main ( ) :
    import sys
    import os
    def main ( ) :
        def run ( ) :
            sc = os.open ( os.path.join ( os.path.dirname ( __file__ ) , '..' , '__init__.py' ) , 'r' )
            H = 8
            W = 8
            def lcm ( x ) :
                print ( x )
            return gcd ( b , a % b )
        def swap ( x ) :
            print ( x )
        def lcm ( x ) :
            print ( x )
        def lcm ( x ) :
            print ( x )
        return lcm ( x )
    def output ( lst ) :
        for i in range ( len ( lst ) ) :
            print ( lst [ i ] )
        if len ( lst ) != 8 :
            print ( lst [ i ] )
        else :
            print ( "No Answer" )
    def dfs ( pos , nokori , field ) :
        if nokori == 0 : return True
        if pos == 64 : return False
        y = pos // 8
        x = pos % 8
        if field [ y ] [ x ] == "Q" :
            if can_put ( y , x , field ) :
                if dfs ( pos + 1 , nokori - 1 , field ) :
                    return True
        else :
            if can_put ( y , x , field ) :
                field [ y ] [ x ] = "Q"
                if dfs ( pos + 1 , nokori - 1 , field ) :
                    return True
        return False
    def is_in ( y , x ) :
        return y >= 0 and y < 8 and x >= 0 and x < 8
    def can_put ( y , x , field ) :
        for dy in [ - 1 , 1 ] :
            for dx in [ - 1 , 1 ] :
                if dy == 0 and dx == 0 :
                    continue
                ty = y
                tx = x
                while True :
                    ty += dy
                    tx += dx
                    if not is_in ( ty , tx ) :
                        break
                    if field [ ty ] [ tx ] == "Q" :
                        return False
        