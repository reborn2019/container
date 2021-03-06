package com.lody.virtual.client.hook.patchs.pm;

import java.lang.reflect.Method;

import com.lody.virtual.client.hook.base.Hook;

/**
 * @author Lody
 *
 *
 *
 */
/* package */ class GetPermissions extends Hook {

	@Override
	public String getName() {
		return "getPermissions";
	}

	@Override
	public Object call(Object who, Method method, Object... args) throws Throwable {
		return method.invoke(who, args);
	}
}
