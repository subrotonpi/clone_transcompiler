def main ( ) :
    import sys
    from nltk.corpus import brown
    sc = brown.corpus
    line = sc.next ( )
    if line == 'A' :
        print ( 'T' )
    elif line == 'T' :
        print ( 'A' )
    elif line == 'C' :
        print ( 'G' )
    elif line == 'G' :
        print ( 'C' )
