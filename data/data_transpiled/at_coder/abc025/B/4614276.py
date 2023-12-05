def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( sys.stdin.readline ( ) )
            self.a = int ( sys.stdin.readline ( ) )
            self.b = int ( sys.stdin.readline ( ) )
            self.s = [ ]
            self.d = [ ]
            for i in range ( self.n ) :
                self.s.append ( self.s [ i ] )
                self.d.append ( self.d [ i ] )
    ans = 0
    for i in range ( self.n ) :
        dis = d [ i ]
        if dis < a :
            if s [ i ] [ 0 ] == 'E' :
                ans += a
            else :
                ans -= a
        elif dis > b :
            if s [ i ] [ 0 ] == 'E' :
                ans += b
            else :
                ans -= b
        else :
            if s [ i ] [ 0 ] == 'E' :
                ans += dis
            else :
                ans -= dis
    if ans < 0 :
        print ( 'West ' , end = ' ' )
        print ( - ans )
    elif ans > 0 :
        print ( 'East ' , end = ' ' )
        print ( ans )
    else :
        print ( 0 )
