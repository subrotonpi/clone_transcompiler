def main ( args ) :
    import sys
    from os.path import join
    list = [ ]
    with open ( join ( sys.argv [ 1 ] , '..' ) ) as sc :
        S = sc.read ( )
        T = sc.read ( )
    L = len ( S )
    check = True
    for i in range ( L ) :
        list.append ( str ( S [ i ] ) )
    for i in range ( L ) :
        tmp = list [ L - 1 ]
        list.insert ( 0 , tmp )
        list.pop ( )
        cnt = 0
        for j in range ( L ) :
            if list [ j ] == str ( T [ j ] ) :
                cnt += 1
        if cnt == L :
            print ( 'Yes' )
            check = False
            break
    if check :
        print ( 'No' )
