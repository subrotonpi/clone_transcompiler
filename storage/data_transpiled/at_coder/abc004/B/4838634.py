def main ( ) :
    import sys
    flg = True
    c = 0
    with open ( 'main.txt' , 'r' ) as sc :
        arr = [ [ sc.read ( ) ] for i in range ( 4 ) ]
        for i in range ( 3 , 0 , - 1 ) :
            for j in range ( 3 , 0 , - 1 ) :
                print ( arr [ i ] [ j ] , end = '' )
                if j == 0 :
                    print ( '' )
                else :
                    print ( '' , end = '' )
