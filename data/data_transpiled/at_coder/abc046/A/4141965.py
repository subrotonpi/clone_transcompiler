def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
            self.b = 2
            self.c = 3
        def __repr__ ( self ) :
            return "<a %s %s>" % ( self.a , self.b , self.c )
    a = Main ( )
    b = Main ( )
    c = Main ( )
    count = 3
    if a == b :
        count -= 1
    if b == c :
        count -= 1
    if a == c :
        count -= 1
    if count == 0 :
        count += 1
    print ( count )
