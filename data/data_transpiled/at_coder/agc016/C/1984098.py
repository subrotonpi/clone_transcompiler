def _ _ main _ _ ( ) : return sys.stdin.read ( )
def _main ( ) : return sys.stdin.read ( )
def _main ( ) : return sys.stdout.write ( '' )
INPUT = ''
MOD = 1_000_000_007
inf = sys.maxsize / 2
def _solve ( * o ) :
    h , w , a , b = _unpack ( '>I' , o )
    if h % a == 0 and w % b == 0 :
        print ( 'No' )
        return
    grid = a * b
    min = - 1000000000
    res = - min / ( a * b - 1 ) - 1
    print ( 'Yes' )
    for i in range ( 1 , h + 1 ) :
        for j in range ( 1 , w + 1 ) :
            if i % a == 0 and j % b == 0 :
                print ( min , end = '' )
            else :
                print ( res , end = '' )
        print ( )
def _run ( ) :
    _stdin = sys.stdin if INPUT == '' else StringIO ( INPUT )
    _stdout = sys.stdout
    s = time.time ( )
    _solve ( )
    _stdout.flush ( )
    if not INPUT == '' :
        _tr ( time.time ( ) - s , 'ms' )
    def main ( ) :
        def _inbuf ( ) :
            lenbuf , ptrbuf = 0 , 0
            while not ( _is_space_char ( b ) and b != '' ) :
                yield b
        return _inbuf
    def _skip ( ) :
        while ( _is_space_char ( b ) and b != '' ) :
            yield b
        return
    def _nd ( ) :
        yield ''
    def _run ( ) :
        while ( _is_space_char ( b ) and b != '' ) :
            yield b
        return
    def _run ( ) :
        yield ''
    def _run ( ) :
        yield ''
    def _run ( ) :
        yield ''
