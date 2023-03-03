def _import ( ) : return 33 <= ord ( 'a' )
def next ( ) : return ord ( 'a' )
def next ( ) : return ord ( 'a' )
def next ( ) : return ord ( 'a' )
def next ( ) : return ord ( 'a' )
def ok ( last4 ) :
    return not ( 'AGC' in last4 or 'GAC' in last4 or 'ACG' in last4 or p.match ( last4 ) )
def AGCT ( ) :
    return ''
def recursive ( N , memo , current , last3 ) :
    if current == N :
        return 1
    if memo.get ( current , dict ( ) ).get ( last3 ) :
        return memo [ current ] [ last3 ]
    result = 0
    for c in AGCT :
        last4 = last3.join ( c )
        if ok ( last4 ) :
            result = ( result + recursive ( N , memo , current + 1 , last4 [ 1 : ] ) ) % MOD
    memo.setdefault ( current , dict ( ) ) [ last3 ] = result
    return result
def exec ( myfile , outfile ) :
    N = ord ( myfile.read ( ) )
    memo = { }
    outfile.write ( recursive ( N , memo , 0 , 'TTT' ) )
def main ( ) :
    global BUFFER_SIZE
    global readlength
    global point
    if point < readlength :
        result = buffer [ point ]
        point += 1
        return result
    try :
        readlength = sys.stdin.read ( BUFFER_SIZE )
    except AttributeError :
        pass
    if readlength == 0 :
        return - 1
    if point < readlength :
        return - 1
    if point < readlength :
        return - 1
    return buffer [ point ]
