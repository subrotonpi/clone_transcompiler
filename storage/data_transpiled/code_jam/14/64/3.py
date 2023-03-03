def _import ( ) : return int ( readword ( ) )
def dread ( ) : return float ( readword ( ) )
def lread ( ) : return long ( readword ( ) )
def solve ( ) :
    N , A = iread ( )
    a = [ ]
    for s in readword ( ) :
        for i in range ( N ) :
            a.append ( s [ i ] == 'Y' )
    ans = stupid ( )
    if ans is None :
        print ( ' IMPOSSIBLE' , end = '' )
    else :
        for i in range ( N ) :
            print ( '' , ans [ i ] , end = '' )
    return ans
def stupid ( ) :
    try :
        ans_stupid = [ ]
        was = [ ]
        for i in range ( N ) :
            was.append ( True )
            ans_stupid.append ( i )
            dfs ( i , 1 )
            was.append ( False )
    except :
        return ans_stupid
    return None
def dfs ( cur , num ) :
    if num == N :
        if cur == A : raise ValueError
        return
    for i in range ( N ) :
        if not was [ i ] :
            j = a [ cur ] [ i ]
            ans_stupid.append ( i )
            was [ i ] = True
            dfs ( j , num + 1 )
            was [ i ] = False
    df = { 'eps' : "0.0000000000" }
    def solve_gcj ( ) :
        tests = iread ( )
        for test in range ( 1 , tests + 1 ) :
            print ( 'Case #%d:' % test )
            solve ( )
            print ( '\n' , end = '' )
    return df
