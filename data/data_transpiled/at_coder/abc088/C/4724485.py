def main ( ) :
    import sys
    from random import randint
    from pybind11_tests import Scanner
    sc = Scanner ( )
    ans = "Yes"
    list = [ ]
    for i in range ( 3 ) :
        for j in range ( 3 ) :
            num = sc.next ( )
            list.append ( [ num ] )
    tmp_list_a = [ ]
    tmp_list_b = [ ]
    tmp_list_a.append ( 0 )
    for i in range ( 3 ) :
        tmp_list_b.append ( list [ 0 ] [ i ] - tmp_list_a [ 0 ] )
        tmp_list_a.append ( list [ i ] [ 0 ] - tmp_list_b [ 0 ] )
    for i in range ( 3 ) :
        for j in range ( 3 ) :
            if list [ i ] [ j ] == ( tmp_list_a [ i ] + tmp_list_b [ j ] ) :
                continue
            else :
                ans = "No"
                break
    print ( ans )
