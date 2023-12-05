def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        K = sc.count ( )
        s = sc.next ( )
        koshi = Koshi ( 0 , 0 )
        koshi.re_link ( )
        for i in range ( K ) :
            if s [ i ] == 'L' :
                koshi = koshi.left
            elif s [ i ] == 'R' :
                koshi = koshi.right
            elif s [ i ] == 'U' :
                koshi = koshi.up
            elif s [ i ] == 'D' :
                koshi = koshi.down
            koshi.re_link ( )
        print ( koshi.x , koshi.y )
    class Koshi ( object ) :
        def __init__ ( self ) :
            self._dict = { }
            self.up , self.down , self.left , self.right = self._dict
        def __init__ ( self , x , y ) :
            self.x , self.y = x , y
            self._dict [ self.hash ( ) ] = self
        def re_link ( self ) :
            if not self.left :
                self.left = self.get ( x - 1 , y )
            if not self.right :
                self.right = self.get ( x + 1 , y )
            if not self.up :
                self.up = self.get ( x , y + 1 )
            if not self.down :
                self.down = self.get ( x , y - 1 )
            self.left , self.right , self.left , self.up , self.down , self.down , self.up = self._dict [ self.hash ( ) ]
        def hash ( self ) :
            return self.x , self.y
        def __getitem__ ( self , x , y ) :
            if self._dict.has_key ( self.hash ( x , y ) ) :
                return self._dict [ self.hash ( x , y ) ]
            return self.x , self.y
return Main
