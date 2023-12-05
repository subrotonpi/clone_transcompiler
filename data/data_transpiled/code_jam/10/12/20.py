def _ _ main _ _ ( ) : return sys.stdin.readline ( )
def main ( ) : return sys.stdout.readline ( )
def main ( ) : return sys.stdin.readline ( )
def main ( ) : return sys.stdout.readline ( )
def main ( ) :
    if is_server :
        f = open ( 'in.txt' , 'r' )
        out = open ( 'out.txt' , 'w' )
    else :
        f = open ( 'in.txt' , 'r' )
        out = open ( 'out.txt' , 'w' )
    ( Solution ( ).run ( ) )
def load_line ( ) :
    try :
        stk = tokenize ( f.readline ( ) )
    except tokenize.TokenError :
        pass
def next_word ( ) :
    while not stk or not stk :
        load_line ( )
    return stk [ 0 ]
def randint ( ) :
    while not stk or not stk :
        load_line ( )
    return int ( stk [ 1 ] )
def uniform ( ) :
    while not stk or not stk :
        load_line ( )
    return uniform ( )
def uniform ( ) :
    while not stk or not stk :
        load_line ( )
    return uniform ( )
def uniform ( ) :
    while not stk or not stk :
        load_line ( )
    return uniform ( )
def uniform ( ) :
    return uniform ( )
def uniform ( ) :
    return uniform ( )
def run ( ) :
    tt = randint ( )
    for t in range ( tt ) :
        A = randint ( )
        B = randint ( )
        m = randint ( )
        n = randint ( ) + 1
        arr = [ randint ( ) for _ in range ( n ) ]
        arr [ 0 ] = 0
        dp = [ [ 0 ] * 256 ]
        for i in range ( n ) :
            dp [ i ] = dp [ i ] + A * ( n - i )
    return dp
return run
