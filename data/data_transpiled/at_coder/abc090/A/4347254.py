def main ( args ) :
    import sys
    from ..import main
    with open ( 'input.txt' , 'r' ) as sc :
        input1 = sc.read ( )
        input2 = sc.read ( )
        input3 = sc.read ( )
        print ( input1 [ 0 ] + input2 [ 1 ] + input3 [ 2 ] )
