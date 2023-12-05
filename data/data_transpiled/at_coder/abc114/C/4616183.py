def Main ( ) :
    _scanner = _Scanner ( )
    n = _scanner.next ( )
    def dfs ( s ) :
        print ( dfs ( '' ) )
    def dfs ( s ) :
        return 0 if not s.startswith ( ' ' ) and int ( s ) > n else ( 3 in s and '5' in s and '7' in s ) + dfs ( s + '3' ) + dfs ( s + '5' ) + dfs ( s + '7' )
    return dfs
