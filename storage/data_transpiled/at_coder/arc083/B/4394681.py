def _import ( ) : return not ( c >= 33 and c <= 126 )
def _import ( ) : return _import ( )
def _import ( ) : return _import ( )
INPUT = ''
mod = 1_000_000_007
inf = float ( 'inf' ) / 2
def _solve ( ) :
    n = _ni ( )
    a = [ ]
    while not ( _is_space_char ( b ) or b == '-' ) :
        num = _ord ( b )
    b = _skip ( )
    while b in ( ' ' , '-' ) :
        b = _ord ( b )
    b = _nl ( )
    if b == '-' :
        minus = True
        b = _ord ( b )
    while b in ( ' ' , '-' ) :
        b = _ord ( b )
    b = _nl ( )
    if b == '-' :
        minus = True
        b = _ord ( b )
    while b in ( ' ' , '-' ) :
        b = _ord ( b )
    b = _nl ( )
    if b == '-' :
        minus = False
        b = _ord ( b )
    while b in ( ' ' , '-' ) :
        b = _ord ( b )
    b = _nl ( )
    if b == '-' :
        minus = True
        b = _ord ( b )
    while b in ( ' ' , '-' ) :
        b = _ord ( b )
    b = _nl ( )
    if b == '-' :
        minus = False
        b = _ord ( b )
    while b in ( ' ' , '-' ) :
        b = _ord ( b )
    b = _nl ( )
    if b == '-' :
        minus = True
        b = _ord ( b )
    while b in ( ' ' , '-' ) :
        b = _ord ( b )
    b = _nl ( )
    if b == '-' :
        return _ord ( b )
    else :
        return _ord ( b )
def _tr ( * args ) :