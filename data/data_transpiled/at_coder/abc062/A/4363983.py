def main ( ) :
    import sys
    list = [ 0 , 1 , 3 , 1 , 2 , 1 , 2 , 1 , 1 , 2 , 1 , 2 , 1 ]
    with open ( 'test.txt' , 'r' ) as sc :
        a = sc.read ( )
        b = sc.read ( )
        ans = ( list [ a ] == list [ b ] ) and 'Yes' or 'No'
        print ( ans )
