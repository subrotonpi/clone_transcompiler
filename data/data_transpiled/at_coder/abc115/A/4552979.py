def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.corpus import lemanamesreader
    D = lemanamesreader ( )
    if D == 25 :
        print ( 'Christmas' , end = ' ' )
    if D == 24 :
        print ( 'Christmas Eve' , end = ' ' )
    if D == 23 :
        print ( 'Christmas Eve Eve' , end = ' ' )
    if D == 22 :
        print ( 'Christmas Eve Eve' , end = ' ' )
