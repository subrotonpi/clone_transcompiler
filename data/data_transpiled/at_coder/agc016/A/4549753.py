def main ( ) :
    import sys
    from string import ascii_letters
    sc = open ( 'input.txt' , 'r' )
    s = sc.read ( )
    min = sys.maxint
    for c in ( 'a' , 'z' , 'A' , 'B' , 'C' , 'D' , 'E' , 'F' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' , 'E' , 'G' ] :