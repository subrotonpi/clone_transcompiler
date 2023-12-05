static final int [ ] getFactors ( ) {
  final int INF = 10 * 18 ;
  final int MOD = 10 * 9 + 7 ;
  {
    if ( INF == 0 ) {
      return 1 ;
    }
    else if ( INF == 1 ) {
      return INF ;
    }
    else if ( INF % 2 == 0 ) {
      return POW ( INF , INF / 2 ) * INF % MOD ;
    }
    else {
      return POW ( INF , INF / 2 ) * INF * INF % MOD ;
    }
  }
  {
    return POW ( INF , INF / 2 ) * INF * INF % MOD ;
  }
  {
    return ModFactorial ( INF , MOD - 2 ) % MOD ;
  }
  {
    return ModFactorial ( INF , MOD ) * MOD ;
  }
  {
    return ModFactorial ( INF , MOD ) * MOD ;
  }
  {
    return ModFactorial ( INF , MOD ) * MOD ;
  }
  {
    {
      return ModFactorial ( INF , MOD ) * MOD ;
    }
  }
  {
    {
      return ModFactorial ( INF , MOD ) * MOD ;
    }
  }
  {
    {
      return ModFactorial ( INF , MOD ) * MOD ;
    }
  }
  {
    {
      return ModFactorial ( INF , MOD ) * MOD ;
    }
  }
  {
    {
      return ModFactorial ( INF , MOD ) * MOD ;
    }
  }
  {
    {
      return ModFactorial ( INF , MOD ) * MOD ;
    }
  }
  {
    {
      return ModFactorial ( INF , MOD ) * MOD ;
    }
  }
  {
    {
      return ModFactorial ( INF , MOD ) * MOD ;
    }
  }
  {
    {
      return ModFactorial ( INF , MOD ) * MOD ;
    }
  }
  {
    {
      return ModFactorial ( INF , MOD ) * MOD ;
    }
  }
  {
    {
      return ModFactorial ( INF , MOD ) * MOD ;
    }
  }
  {
    {
      return ModFactorial ( INF , MOD ) * MOD ;
    }
  }
  {
    {
      return ModFactorial ( INF , MOD ) * MOD ;
    }
  }
  {
    {
      return ModFactorial ( INF , MOD ) * MOD ;
    }
  }
  {
    {
      return ModFactorial ( INF , MOD ) * MOD ;
    }
  }
  {
    {
      return ModFactorial ( INF , MOD ) * MOD ;
    }
  }
  {
    {
      return ModFactorial ( INF , MOD ) * MOD ;
    }
  }
  {
    {
      return ModFactorial ( INF , MOD ) * MOD ;
    }
  }
  {
    return ModFactorial ( INF , MOD ) * MOD ;
  }
}
