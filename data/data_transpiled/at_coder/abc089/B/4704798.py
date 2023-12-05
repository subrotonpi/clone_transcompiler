def main ( ) :
    import sys
    import csv
    class Main ( csv.writer ) :
        def __init__ ( self ) :
            stdin.readline ( )
            cnt = [ x for x in stdin.readline ( ).split ( ) if x ] [ 0 ]
    cnt = [ x for x in sys.stdin if x ] [ 0 ].issubset ( [ 0 , 3 ] )
    ans = 'Three' if cnt == 3 else 'Four'
    print ( ans )
