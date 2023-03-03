def Main ( ) :
    i = 100100
    a = [ ]
    b = [ ]
    four , two , one = 0 , 0 , 0
    def main ( ) :
        c = Main ( )
        _sc = open ( "/proc/stb" , "r" )
        data = _sc.read ( )
        temp = data.strip ( ).split ( )
        n = int ( long ( temp [ 0 ] ) )
        c.read_in ( n , _sc )
        c.check ( )
        _sc.close ( )
    def read_in ( n , _sc ) :
        data = _sc.read ( )
        temp = data.strip ( ).split ( )
        for i in range ( n ) :
            a [ i ] = long ( temp [ i ] )
            if a [ i ] % 4 == 0 :
                four += 1
            elif a [ i ] % 2 == 0 :
                two += 1
            else :
                one += 1
    def check ( ) :
        if one > four + 1 or ( one == four + 1 and two != 0 ) :
            print ( "No" )
        else :
            print ( "Yes" )
    return c
