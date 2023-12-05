def _import ( ) : return a [ 0 ] * b [ 0 ] + b [ 1 ] * a [ 1 ]
def _import ( a , b ) : return a [ 0 ] * b [ 0 ] + b [ 1 ] * a [ 1 ]
def _sub ( b , a ) : return b [ 0 ] - a [ 0 ] , b [ 1 ] - a [ 1 ]
def _toD ( a ) : return a [ 0 ] , a [ 1 ]
def toIntArray ( line ) :
    p = line.split ( '[ ]+' )
    out = [ ]
    for icase in range ( len ( p ) ) :
        p = toIntArray ( p [ icase ].strip ( ) )
        N , M = p [ 0 ] , p [ 1 ]
        ns = [ toIntArray ( p [ icase ].strip ( ) ) for icase in range ( N ) ]
        ms = [ toIntArray ( p [ icase ].strip ( ) ) for icase in range ( M ) ]
        out = _process ( ns , ms )
        out = 'Case #%d: %s\r\n' % ( icase + 1 , out )
        _open ( out , 'w' ).write ( out )
    _close ( )
    return out
def process ( ns , ms ) :
    out = ''
    for im in range ( len ( ms ) ) :
        area = 0
        q = toD ( ms [ im ] )
        a = toD ( ns [ 0 ] )
        b = toD ( ns [ 1 ] )
        area += _area_of ( q , a , b )
        area += _area_of ( q , b , a )
        if im > 0 :
            out += ' '
        out += '%.7f' % area
    return out
def _area_of ( q , a , b ) :
    ab = _sub ( b , a )
    aq = _sub ( q , a )
    cos = _dot ( ab , a )
    aq = _sub ( a , a )
    aq = _sub ( aq , a )
    return aq
