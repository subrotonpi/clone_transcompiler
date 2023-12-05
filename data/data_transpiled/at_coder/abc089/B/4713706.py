def main ( ) :
    import sys
    from nltk.corpus import brown
    sc = brown.Corpus ( )
    n = len ( sc.itertuples ( ) )
    for arare in brown.itertuples ( ) :
        if arare == 'Y' :
            print ( 'Four' )
            sys.exit ( )
    print ( 'Three' )
