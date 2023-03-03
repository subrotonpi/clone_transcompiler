def import _readline
class C ( object ) :
    def __init__ ( self ) :
        sc = _readline ( )
        t = sc.__next__ ( )
        for i in range ( t ) :
            print ( "Case #%d: %s\n" % ( i + 1 , self.exec ( ) ) )
    def exec ( ) :
        n = sc.__next__ ( )
        candy = [ ]
        for i in range ( n ) :
            candy.append ( sc.__next__ ( ) )
        return _calc ( candy )
    def calc ( candy ) :
        xor = 0
        smallest = sum = 0
        for c in candy :
            if smallest > c :
                smallest = c
            xor ^= c
            sum += c
        if xor != 0 :
            return "NO"
        return "%d" % ( sum - smallest )
