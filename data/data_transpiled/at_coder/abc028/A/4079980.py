def main ( ) :
    import sys
    from nltk.corpus import brown
    from nltk.util import get_scanner
    sc = get_scanner ( )
    n = int ( sc.read ( ) )
    if n <= 59 :
        ans = 'Bad'
    elif n <= 89 :
        ans = 'Good'
    elif n <= 99 :
        ans = 'Great'
    else :
        ans = 'Perfect'
    print ( ans )
