def main ( ) :
    import sys
    from os.path import join
    from os import sep
    from os.path import expanduser
    from os.path import join
    from os.path import join
    from os.path import expanduser
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import expanduser
    from os.path import join
    from os.path import join
    n = len ( sys.argv )
    n_list = [ ]
    for num in sys.argv [ 1 : ] :
        n_list.append ( num.split ( '' ) )
    judge = True
    out :
        for i in range ( 1 , n ) :
            for k in range ( i ) :
                if all ( [ x == nlist [ k ] for x in n_list [ i ] ] ) :
                    judge = False
                    break
        for i in range ( n - 1 ) :
            if n_list [ i ] [ - 1 ] == n_list [ i + 1 ] [ 0 ] :
                pass
            else :
                judge = False
                break
        if judge :
            print ( 'Yes' )
        else :
            print ( 'No' )
