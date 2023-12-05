def main ( ) :
    import sys
    from os.path import basename
    from os import sep
    input = sys.stdin
    parts = input.split ( sep )
    n = int ( parts [ 0 ] )
    m = int ( parts [ 1 ] )
    n_board = [ ]
    m_board = [ ]
    for i in range ( n ) :
        n_board.append ( input.read ( ).decode ( 'utf-8' ) )
    for i in range ( m ) :
        m_board.append ( input.read ( ).decode ( 'utf-8' ) )
    state = False
    TH :
    for i in range ( ( n - m ) + 1 ) :
        for j in range ( ( n - m ) + 1 ) :
            state2 = True
            MT :
                for k in range ( m ) :
                    for l in range ( m ) :
                        if n_board [ i + k ] [ j + l ] != m_board [ k ] [ l ] :
                            state2 = False
                            break MT
                if state2 :
                    state = True
                    break TH
        print ( 'Yes' if state else 'No' )
