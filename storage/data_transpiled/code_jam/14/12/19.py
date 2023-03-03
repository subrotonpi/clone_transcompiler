def _import ( ) : return int ( next ( ) )
def __next__ ( ) : return long ( next ( ) )
def nextDouble ( ) : return float ( next ( ) )
def __next__ ( ) :
    while not __next__ or __next__ not in sys.argv :
        sys.argv.remove ( __next__ )
    return sys.argv [ 1 ]
def main ( ) :
    global _tokenizer
    _tokenizer = None
    f = open ( 'B-large.in' , 'r' )
    writer = open ( 'B-large.out' , 'w' )
    banana ( )
    f.close ( )
    writer.close ( )
def banana ( ) :
    T = randint ( 0 , 100 )
    for t in range ( T ) :
        writer.write ( 'Case #%d: ' % ( t + 1 ) )
        solve ( )
global n
global used
global g
dfs ( curr )
used [ curr ] = True
cal = g [ curr ]
cand = [ ]
for next in cal :
    if used [ next ] == False :
        cand.append ( dfs ( next ) )
if len ( cand ) == 0 or len ( cand ) == 1 :
    return 1
cand.sort ( )
return cand [ - 2 ] + cand [ - 1 ] + 1
