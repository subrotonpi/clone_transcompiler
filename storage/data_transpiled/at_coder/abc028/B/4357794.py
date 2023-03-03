def main ( ) :
    import sys
    from nltk.corpus import brown
    sc = brown.corpus ( 's1' )
    s = sc.read ( )
    c = [ 0 ] * 6
    for i in s :
        if i == 'A' :
            c [ 0 ] += 1
        elif i == 'B' :
            c [ 1 ] += 1
        elif i == 'C' :
            c [ 2 ] += 1
        elif i == 'D' :
            c [ 3 ] += 1
        elif i == 'E' :
            c [ 4 ] += 1
        elif i == 'F' :
            c [ 5 ] += 1
    print ( c [ 0 ] , c [ 1 ] , c [ 2 ] , c [ 3 ] , c [ 4 ] , c [ 5 ] )
