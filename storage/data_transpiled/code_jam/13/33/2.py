def _import ( ) : return
def _raise ( spans , attack ) :
    minX = attack [ 'minX' ]
    maxX = attack [ 'maxX' ]
    nSpans = len ( spans )
    first = nSpans - 1
    while first < last :
        mid = first + ( last - first ) // 2
        s = spans [ mid ]
        if minX >= s [ 'minX' ] and minX <= s [ 'maxX' ] :
            first = mid
        elif minX > s [ 'maxX' ] :
            first = mid + 1
        else :
            last = mid - 1
    while first < nSpans :
        span = spans [ first ]
        if span.minX > maxX :
            pos += 1
            continue
        if minX > span.minX :
            before = open ( inputFile + '.out' , 'a' )
            nCases = int ( in open ( inputFile + '.out' , 'a' ).read ( ) )
            pos += 1
        if maxX < span.minX :
            after = [ ]
            pos += 1
        if maxX < span.minX :
            break
        if minX > s [ 'minX' ] :
            return True
    def go ( inputFile ) :
        f = open ( inputFile + '.out' , 'a' )
        minX = tmp [ 2 ]
        maxX = tmp [ 3 ] - 1
        before.height = int ( f.read ( ) )
        pos += 1
        for c in range ( 1 , nCases ) :
            tmp = toInts ( f.read ( ) )
            att = Attack ( tmp )
            atts [ a ] = att
        res = _result ( atts )
        line = 'Case #' + str ( c ) + ': ' + str ( res )
        print ( line )
        f.write ( line + '\n' )
    return
class C ( ) :
    minX , maxX = s.strip ( ).split ( ' ' )
    def __init__ ( self ) :
        self.minX , minX = minX , 0
    def __init__ ( self ) :
        self.minX , maxX = minX , 0
        self.minX = minX , maxX
        self.strength = 0
        self.minX = minX , maxX
        self.minX = minX
        self.strength =