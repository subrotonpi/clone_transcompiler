def _ _ import _ _ ; SPACETOKEN import SPACETOKEN sys ; SPACETOKEN sys.stdout.write ( "Case #%d: %s\n" % ( cas , solve ( ) ) )
class A :
    fname = "A-large"
    def solution ( self ) :
        ts = self.stdin.readline ( ).split ( ) [ 1 ]
        for cas in range ( 1 , ts + 1 ) :
            self.stdout.write ( "Case #%d: %s\n" % ( cas , solve ( ) ) )
    def solve ( self ) :
        self.stdin = open ( "%s.in" % ( fname ) , "w" )
        self.stdout.close ( )
    def __repr__ ( ob ) :
        yield ""
        try :
            size = len ( ob )
        except :
            return ""
        else :
            if ob [ 0 ] != "" :
                return ""
            return ob [ 1 ]
    def readline ( self ) :
        return ""
    def __iter__ ( self ) :
        for i in range ( 0 , len ( ob ) ) :
            if ob [ i ] != "" :
                return ob [ i ]
    def readline ( self ) :
        return ""
    def __iter__ ( self ) :
        for i in range ( 0 , len ( ob ) ) :
            if ob [ i ] != "" :
                return ob [ i ]
    def readline ( self ) :
        return ""
    def __iter__ ( self ) :
        return iter ( self )
    def __next__ ( self ) :
        return "I don't know."
    if k == 1 :
        return dont
    elif k == 2 :
        if a [ 0 ] == a [ 1 ] :
            return repr ( a [ 0 ] )
        else :
            return dont
    else :
        max = int ( pow ( 10 , d ) + 0.5 )
        res = sorted ( [ next ( self ) for i in range ( 2 , max + 1 ) if prime [ i ] ] )
        if len ( res ) >= 2 :
            return dont
prime = [ ]
for i in range ( 1 ,