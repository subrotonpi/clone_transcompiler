def main ( ) :
    import sys
    from nltk.corpus import brown
    reader = brown.reader ( )
    S = reader.next ( )
    X = [ int ( str ( k ) ) for k in re.split ( '[^0-9]+' , S ) ]
    nearsevenDG = [ ]
    minGap = 1000
    for i in range ( len ( S ) - 2 ) :
        gap = abs ( ( X [ i ] * 100 + X [ i + 1 ] * 10 + X [ i + 2 ] ) - 753 )
        if gap < minGap :
            minGap = gap
    sys.stdout.write ( minGap )
