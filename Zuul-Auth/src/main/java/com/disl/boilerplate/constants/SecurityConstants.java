package com.disl.boilerplate.constants;

public class SecurityConstants {
	public static final String SECRET = "2034f6e32958647fdff75d265b455ebf";
	public static final long EXPIRATION_TIME = 86400000; // 10 days
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String HEADER_STRING = "Authorization";
	public static final long REFRESH_TOKEN_EXPIRATION_TIME =  864000000;

	public static final String[] JWTDisabledAntMatchers = {
			"/signin",
			"/signup",
			"/resetpassword/**",
			"/pass-reset",
			"/forgetpassword",
			"/verify/**",
			"/v2/api-docs",
            "/configuration/ui",
            "/swagger-resources/**",
            "/configuration/security",
            "/swagger-ui.html",
			"/webjars/**",
			"/refreshtoken",
			"/your-service/configuration/ui",
			"/your-service/swagger-resources/**",
			"/your-service/configuration/security",
			"/your-service/swagger-ui.html",
			"/your-service/webjars/**",
			"/your-service/v2/api-docs",
	};


}
