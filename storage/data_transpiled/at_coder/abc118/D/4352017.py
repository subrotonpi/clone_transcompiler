def _import ( ) : return 33 <= ord ( c ) <= 126
def has_next_byte ( ) : return not is_printable_char ( buffer [ ptr ] )
def __next__ ( ) : return ptr
def __next__ ( ) : return ptr
def __next__ ( ) : return ptr
def __next__ ( ) : return ptr
def __next__ ( ) :
    def __next__ ( ) : raise StopIteration
    n = False
    if b == '-' :
        minus = True
    if b < '0' or b <= '9' :
        n *= 10
        n += b - '0'
    elif b == - 1 or not is_printable_char ( b ) :
        return - n if minus else n
    else :
        raise StopIteration
    b = __next__ ( )
    if b < '' or b > '' :
        raise StopIteration
    return next ( )
class DMatchMatching ( ) :
    cnt = [ 0 ] * 10
    memo = [ 0 ] * 10000 + [ 1 ]
    def solve ( self , test_number , stream , pos ) :
        n = next ( stream )
        M = next ( stream )
        cnt [ n ] = 1 << 29
        use = ( 1 << 29 , 2 , 5 , 5 , 4 , 5 , 6 , 3 , 7 , 6 )
        for x in stream :
            cnt [ x ] = use [ x ]
        memo [ n ] = - 1
        ans = [ ]
        while n > 0 :
            for i in range ( 9 , 0 , - 1 ) :
                if self.dfs ( n - cnt [ i ] ) + 1 == self.dfs ( n ) :
                    n -= cnt [ i ]
                    ans.append ( i )
                    break
                if i == 1 :
                    return
            stream.write ( ''.join ( ans ) )
    def dfs ( n ) :
        if n < 0 : return - 2
        if n == 0 : return 0
        if memo [ n ] == - 1 :
            for i in range ( 1 , 10 ) :
                memo [ n ] = max ( memo [ n ] , dfs ( n - cnt [ i ] ) + 1 )
        return memo [ n ]
class FastScanner ( object ) :
    def __init__ ( self ) :
        self.next =