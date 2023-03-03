def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.corpus import lemanamesents
    D = lemanamesents.find_one ( )
    if D == 25 :
        print ( 'Christmas' )
    elif D == 24 :
        print ( 'Christmas Eve' )
    elif D == 23 :
        print ( 'Christmas Eve Eve' )
    elif D == 22 :
        print ( 'Christmas Eve Eve' )
