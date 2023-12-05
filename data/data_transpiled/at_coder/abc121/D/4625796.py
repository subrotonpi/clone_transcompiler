def _import ( ) :
    from os import urandom
    from os import urandom
    class Main ( object ) :
        def __init__ ( self ) :
            self.stdin = urandom ( 256 )
            self.stdin.close ( )
        def close ( self ) :
            cin.close ( )
    a = int ( sys.stdin.read ( ) )
    b = int ( sys.stdin.read ( ) )
    res = 0
    if a % 2 == 1 and b % 2 == 0 :
        res = a ^ b
        a += 1
        b -= 1
    elif a % 2 == 1 and b % 2 == 1 :
        res = a
        a += 1
    elif a % 2 == 0 and b % 2 == 0 :
        res = b
        b -= 1
    diff = ( b - a + 1 ) // 2
    mark = 0
    if diff % 2 == 1 :
        mark = 1
    print ( res ^ mark )
